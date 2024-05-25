package org.main;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciYonetim {

	private ArrayList<Ogrenci> ogrenciler;
	private Scanner scanner;
	
	public OgrenciYonetim() {
		ogrenciler  = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	public void ogrenciEkle() {
		System.out.print("Öğrenci adı girin: ");
		String ad = scanner.nextLine();
		System.out.print("Öğrenci soyadı girin: ");
		String soyad = scanner.nextLine();
		System.out.print("Öğrenci yaşı girin: ");
		int yas = scanner.nextInt();
		System.out.print("Öğrenci numarası girin: ");
		int numara = scanner.nextInt();
		
		Ogrenci ogrenci = new Ogrenci(ad, soyad, yas, numara);
		ogrenciler.add(ogrenci);
		System.out.println("Öğrenci başarıyla eklendi!");
	}
	
	public void ogrenciGor() {
		if(ogrenciler.isEmpty()) {
			System.out.println("Hiç öğrenci yok.");
			return;
		}
		for (Ogrenci ogrenci : ogrenciler) {
			System.out.println(ogrenciler);
		}
	}
	
	public void ogrenciDuzenle() {
		System.out.print("Düzenlenecek öğrencinin numarasını girin: ");
		int numara = scanner.nextInt();
		scanner.nextLine();
		
		for(Ogrenci ogrenci : ogrenciler) {
			if(ogrenci.getNumara() == numara) {
				System.out.print("Yeni isim: ");
				String ad = scanner.nextLine();
				System.out.print("Yeni soyisim: ");
				String soyisim = scanner.nextLine();
				System.out.print("Yeni yaş: ");
				int yas = scanner.nextInt();
				
				
				ogrenci.setAd(ad);
				ogrenci.setSoyad(soyisim);
				ogrenci.setYas(yas);
				
				System.out.println("Öğrenci başarıyla yenilendi.");
				return;
			}
		}
		
		System.out.println("Öğrenci bulunamadı");
	}
	
	public void ogrenciSil() {
		System.out.println("Silinecek ogrencinin numarası: ");
		int numara = scanner.nextInt();
		scanner.nextLine();
		
		ogrenciler.removeIf(ogrenci -> ogrenci.getNumara() == numara);
		System.out.println("Öğrenci başarıyla silindi.");
	}
	
	public void menu() {
		while(true) {
			System.out.println("\n 1 - Öğrenci ekle");
			System.out.println("\n 2 - Öğrencileri gör");
			System.out.println("\n 3 - Öğrenci düzenle");
			System.out.println("\n 4 - Öğrenci sil");
			System.out.println("\n 5 - Çıkış");
			System.out.print("Yapmak istediğiniz işlemi seçin: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case 1: 
					ogrenciEkle();
					break;
				case 2:
					ogrenciGor();
					break;
				case 3:
					ogrenciDuzenle();
					break;
				case 4:
					ogrenciSil();
					break;
				case 5:
					System.out.println("Çıkış yapılıyor...");
					return;
				default: 
					System.out.println("Geçersiz işlem! Tekrar deneyin.");
			}
		}
			
	}
	
	public static void main(String[] args) {
		OgrenciYonetim sistem = new OgrenciYonetim();
		sistem.menu();
	}

}
