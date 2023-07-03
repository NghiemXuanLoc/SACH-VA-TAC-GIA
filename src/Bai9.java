/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest14.B9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Book> list = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String tenSach = sc.nextLine();
            double giaSach = sc.nextDouble();
            int soLuongSach = sc.nextInt();
            int soLuongTacGia = sc.nextInt();
            sc.nextLine();
            Author[] authors = new Author[soLuongTacGia];
            for (int j = 0; j < soLuongTacGia; j++) {
                String tenTacGia = sc.nextLine();
                String email = sc.nextLine();
                String gioiTinh = sc.nextLine();
                authors[j] = new Author(tenTacGia, email, gioiTinh.charAt(0));
            }
            Book book = new Book(tenSach, authors, giaSach, soLuongSach);
            list.add(book);
        }

        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book t, Book t1) {
                return t.getName().compareTo(t1.getName());
            }

        });
        sc.nextLine();
        for (Book x : list) {
            System.out.println(x);
            x.getAuthorNames();
        }
    }
}
