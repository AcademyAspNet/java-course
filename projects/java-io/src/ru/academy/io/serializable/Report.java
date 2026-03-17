package ru.academy.io.serializable;

import java.io.Serial;
import java.io.Serializable;

public final class Report implements Serializable {

    @Serial
    private static final long serialVersionUID = -4253035612903526122L;

    private final String title;
    private final String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Report [title = '" + title + "', length = " + content.length() + "]";
    }
}
