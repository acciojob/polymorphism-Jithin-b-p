package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int val1 = p.product(3, 4);
        int val2 = p.product(3, 4, 5);
        double val3 = p.product(3.0, 4.0);
    }
    public static class Product{

        public int product(int x, int y){

            return x * y;

        }
        public int product(int x, int y, int z) {

            return x * y * z;

        }
        public double product(double x, double y) {
            return x * y;
        }
    }

}