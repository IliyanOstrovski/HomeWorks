package com.company.Exceptions;

import java.io.*;

public class Exception1 {
    public static void main(String[] args) {
        String email = "example@gmail.com";

        try {
            boolean isValid = validateEmail(email);
            System.out.println(email + " is a valid email address");
        } catch (IllegalArgumentException e) {
            System.out.println(email + " is not valid email address: " + e.getMessage());
        }
    }

    public static boolean validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty!");
        }
        int atIndex = email.indexOf('@');
        int point = email.lastIndexOf('.');
        if (atIndex < 1 || point + 2 >= email.length() || point < atIndex + 2) {
            throw new IllegalArgumentException("Invalid email: " + email);
        }
        return true;
    }

    public static void procesedFile(String filePath) throws FileNotFoundException, IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("The file is not found! " + filePath);
        } else if (!file.isFile()) {
            throw new IllegalArgumentException("File expected " + filePath);
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //TODO procesed each line
            }
        } catch (IOException e) {
            throw new IOException("Error reading file " + filePath, e);
        }
    }
}
