package view;

import controller.ProductController;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            ProductView.menu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    List<Product> productList = productController.getProducts();
                    for (Product p : productList) {
                        System.out.println("ID: " + p.getId() + " NAME: " + p.getName() + " PRICE: " + p.getPrice());
                    }
                    break;
                case 2: {
                    Product product = ProductView.ProductForm();
                    productController.addProduct(product);
                    break;
                }
                case 3: {
                    System.out.println("Nhap id can sua: ");
                    int id = input.nextInt();
                    Product product = ProductView.ProductForm();
                    productController.updateProduct(id, product);
                    break;
                }
                case 4:
                    System.out.println("Nhap id muon xoa: ");
                    int id = input.nextInt();
                    productController.remoteProduct(id);
                    break;
                case 5:
                    System.out.println("Nhap ten san pham: ");
                    input.nextLine();
                    String name = input.nextLine();
                    Product product = productController.findName(name);
                    if (product != null) {
                        System.out.println("San pham can tim: ");
                        System.out.println(
                                "ID: " + product.getId() +
                                " NAME: " + product.getName() +
                                " PRICE: " + product.getPrice());
                    } else {
                        System.out.println("Khong co san pham can tim!");
                    }
                    break;
                case 6:
                    List<Product> productList1 = productController.sortPrice();
                    for (Product p : productList1) {
                        System.out.println("ID: " + p.getId() + " NAME: " + p.getName() + " PRICE: " + p.getPrice());
                    }
                    break;
            }
        }
        while (choice != 0);
    }

    public static void menu() {
        System.out.println("----------");
        System.out.println("Quan ly san pham");
        System.out.println("1. Hien thi danh sach san pham");
        System.out.println("2. Them moi san pham");
        System.out.println("3. Sua thong tin san pham");
        System.out.println("4. Xoa san pham");
        System.out.println("5. Tim san pham theo ten");
        System.out.println("6. Sap xep san pham theo gia");
        System.out.println("Nhap vao lua chon:");
    }

    public static Product ProductForm() {
        Scanner input = new Scanner(System.in);
        int id;
        String name;
        double price;

        System.out.println("Nhap id: ");
        id = input.nextInt();
        input.nextLine();
        System.out.println("Nhap ten: ");
        name = input.nextLine();
        System.out.println("Nhap gia: ");
        price = input.nextDouble();

        Product product = new Product(id, name, price);
        return product;
    }
}
