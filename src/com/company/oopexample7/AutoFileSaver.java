package com.company.oopexample7;

import java.sql.SQLOutput;

public class AutoFileSaver implements AutoSave, FileSaver{
    @Override
    public void setAutoIntervalSave(int interval) {
        System.out.println("The interval is " + interval);
    }

    @Override
    public void saveFile(String fileName) {
        System.out.println("The filaName is " + fileName);
    }
}
