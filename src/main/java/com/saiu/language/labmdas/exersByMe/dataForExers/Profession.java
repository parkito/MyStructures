package com.saiu.language.labmdas.exersByMe.dataForExers;

/**
 * @author Artem Karnov @date 17.02.2017.
 *         artem.karnov@t-systems.com
 */

public class Profession {
    public enum Level {one, two, three, four}

    private String title;
    private double salary;
    private Level level;

    public Profession(String title, double salary, Level level) {
        this.title = title;
        this.salary = salary;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public Level getLevel() {
        return level;
    }
}
