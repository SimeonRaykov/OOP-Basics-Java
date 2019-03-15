package telephony.classes;

import telephony.interfaces.Browsable;
import telephony.interfaces.Callable;

import java.util.Set;

public class Smartphone implements Browsable, Callable {
    private Set<String> numbers;
    private Set<String> urls;

    public Smartphone(Set<String> numbers, Set<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public Set<String> getNumbers() {
        return numbers;
    }

    public Set<String> getUrls() {
        return urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        boolean isInvalid;
        for (String url : urls) {
            isInvalid = false;
            for (char c : url.toCharArray()) {
                if (Character.isDigit(c)) {
                    sb.append("Invalid URL!").append(System.lineSeparator());
                    isInvalid = true;
                    break;
                }
            }
            if (!isInvalid) {
                sb.append("Browsing: ").append(url).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        boolean isInvalid = false;
        for (String number : numbers) {
            isInvalid = false;
            for (char c : number.toCharArray()) {
                if (!Character.isDigit(c)) {
                    sb.append("Invalid number!").append(System.lineSeparator());
                    isInvalid = true;
                    break;
                }
            }
            if (!isInvalid) {
                sb.append("Calling... ").append(number).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
