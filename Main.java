
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * class main here.
 *
 * @author ilmiza08
 * @version 1.1
 */

 
public class Main
{
    public static void main(String args[])

    {
        ArrayList<String> als = new ArrayList<String>();
        ArrayList<String> alsi= new ArrayList<String>();

        // ArrayList dengan custom Object
        ArrayList<Mahasiswa> arraylistMhs= new ArrayList<Mahasiswa>();
        int nim=0;
        String nama=null, alamat=null, jk=null;
        
        // create an object of Scanner
        Scanner input = new Scanner(System.in);
    
        //  Input jumlah Data yang di inginkan oleh User
        System.out.print("Input jumlah Mahasiswa : ");   
        int jlh_data = input.nextInt();
         
        //  Input Data dan masukkan ke dalam objek ArrayList yang telah Anda buat
        for(int a = 0; a < jlh_data; a++)
        {
            int in = a+1;
            System.out.print("Masukkan Nama Mahasiswa ke - "+ in +" = ");
            nama = input.next();
            System.out.print("Masukkan NIM Mahasiswa ke - "+ in +" = ");
            nim = input.nextInt();
            System.out.print("Masukkan alamat Mahasiswa ke - "+ in +" = ");
            alamat = input.next();
            System.out.print("Masukkan Jenis Kelamin Mahasiswa ke - "+ in +" = ");
            jk = input.next();
            arraylistMhs.add(new Mahasiswa(nim, nama, alamat, jk));
        }
        
        System.out.println("\nDaftar Mahasiswa");
        for(Mahasiswa mhs:arraylistMhs)
        {
            System.out.println("NIM = "+ mhs.getnimMhs());
            System.out.println("Nama = "+mhs.getnamaMhs());
            System.out.println("Alamat = "+mhs.getalamatMhs());
            System.out.println("Jenis Kelamin = "+mhs.getjkMhs()+"\n");
        }
        
        System.out.println("\nUpdate Data Mahasiswa");
        int cariNim;
        System.out.print("Cari NIM = ");
        cariNim = input.nextInt();
        for(Mahasiswa mhs:arraylistMhs)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        System.out.print("Set Nama = ");    
        nama = input.next();
        mhs.setnamaMhs(nama);
        }
        }
         
        System.out.println("\nData Mahasiswa Setelah di Update");
        for(Mahasiswa mhs:arraylistMhs)
        {
            System.out.println("NIM = "+ mhs.getnimMhs());
            System.out.println("Nama = "+mhs.getnamaMhs());
            System.out.println("Alamat = "+mhs.getalamatMhs());
            System.out.println("Jenis Kelamin = "+mhs.getjkMhs()+"\n");
        }
        
        System.out.println("\nRemove Data Mahasiswa");
        System.out.print("Masukkan NIM = ");
        cariNim = input.nextInt();
        for(Mahasiswa mhs:arraylistMhs)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        arraylistMhs.indexOf(mhs);
        arraylistMhs.remove(arraylistMhs.indexOf(mhs));
        break;
        }
        }
        
        System.out.println("\nData Mahasiswa Setelah di Hapus");
        for(Mahasiswa mhs:arraylistMhs)
        {
            System.out.println("NIM = "+ mhs.getnimMhs());
            System.out.println("Nama = "+mhs.getnamaMhs());
            System.out.println("Alamat = "+mhs.getalamatMhs());
            System.out.println("Jenis Kelamin = "+mhs.getjkMhs()+"\n");
        }
         
        System.out.println("\nSearch Data Mahasiswa");
        System.out.print("Cari NIM = ");
        cariNim = input.nextInt();
        System.out.println("\nData Mahasiswa setelah di search");
        
        for(Mahasiswa mhs:arraylistMhs)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        System.out.println("NIM = "+ mhs.getnimMhs());
        System.out.println("Nama = "+mhs.getnamaMhs());
        System.out.println("Alamat = "+mhs.getalamatMhs());
        System.out.println("Jenis Kelamin = "+mhs.getjkMhs()+"\n");
        }
        }
        
        
        System.out.println("\nMemeriksa apakah array list kosong: ");
        System.out.println(arraylistMhs.isEmpty()); 
        
        System.out.println("\nMemeriksa ada berapa array list: ");
        System.out.println(arraylistMhs.size());
        
    } 
}
