package classes;

public class Main {

	public static void main(String[] args) {
      //referance type
      CustomerManager customerManager = new CustomerManager();//2 customer biribirine eşitlendiği zaman new customer ı yazmaya gerek yok.
                      //Kullanmak istediğin isim farklı isim yazılabilir..
      CustomerManager customerManager2=new CustomerManager();
      customerManager=customerManager2;/*her ikisinin referans numarası eşitlendi.
       Eşitlenmeden kaynaklı boşta kalan(kullanılmayan) referans numarası garbage collector tarafından silinir .  */
      customerManager.Add();
      customerManager.Remove();
      customerManager.Update();
      
      //value type
      int sayi1=40;
      int sayi2=20;
      sayi2=sayi1;
      sayi1=30;
      System.out.println(sayi2);
      
      int[] sayilar1=new int [] {1,2,3};
      int[] sayilar2=new int[] {4,5,6};
	  sayilar2=sayilar1;
	  sayilar1[0]=10;
	  System.out.println(sayilar2[0]);

}
}
