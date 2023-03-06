package com.company.Homework11;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder sb1 = new MyStringBuilder("git");
        MyStringBuilder sb2 = new MyStringBuilder(sb1);
        sb2.append("hub");
        System.out.println(sb2); // github


        MyStringBuilder sb = new MyStringBuilder("Hello, World!");

        System.out.println("Initial string: " + sb.toString());

        System.out.println("Capacity: " + sb.capacity());

        System.out.println("Length: " + sb.length());

        sb.setCharAt(0, 'h');
        System.out.println(sb);

        sb.append(" This is my StringBuilder.");
        System.out.println(sb);

        sb.insert(13, " modified");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        int index = sb.indexOf("my");
        System.out.println("indexOf() method: " + index);

        int lastIndex = sb.lastIndexOf("my");
        System.out.println("lastIndexOf() method: " + lastIndex);

        sb.reverse();
        System.out.println(sb);

        sb.replace(13, 22, "replaced");
        System.out.println(sb);

        String substring = sb.substring(0, 5);
        System.out.println("substring() method: " + substring);

        sb.trimToSize();
        System.out.println("trimToSize() method: " + sb);
    }
}

