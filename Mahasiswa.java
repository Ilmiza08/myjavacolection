
/**
 * Write a description of class Mahasiswa here.
 *
 * @author llmiza
 * @version 1.0
 */

   public class Mahasiswa
{
    // instance variables - replace the example below with your own
    private int nim;
    private String nama, alamat, jk;
    
    
    public Mahasiswa(int nim, String nama, String alamat, String jk)
    {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
    }
   
    public String getnamaMhs()
    {
         
        return this.nama;
    }
    public int getnimMhs()
    {
         return this.nim;
    }
    public String getalamatMhs()
    {
         return this.alamat;
    }
    public String getjkMhs()
    {
         return this.jk;
    }
    
    
    public void setnamaMhs(String nama)
    {
        this.nama = nama;
    }
    public void setnimMhs(int nim)
    {
        this.nim = nim;
    }
    public void setalamatMhs(String alamat)
    {
        this.alamat = alamat;
    }
    public void setjkMhs(String jk)
    {
        this.jk = jk;
    }
}