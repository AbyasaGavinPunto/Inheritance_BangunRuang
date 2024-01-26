package pewarisan;

public class Lingkaran extends BangunDatar{
    // jari - jari lingkaran
    float r;
    
    // override
    float luas (){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas Lingkaran :" + luas);
        return luas ;
    }
    
    // oveerride
    float keliling (){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran : "+ keliling);
        return keliling ;
        
    }
}
