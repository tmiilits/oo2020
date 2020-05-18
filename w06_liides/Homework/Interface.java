/**
 * Interface
 */

interface Phone_New{
    public void display_big();
    public void chipset_powerful();
    public void storage_big();
    public void weight_heavy();
}
interface Phone_Old{
    public void display_small();
    public void chipset_weak();
    public void storage_small();
    public void weight_low();
}

class Build implements Phone_New,Phone_Old{
    public void display_big(){
        System.out.println(" 6.1 inches ");
    }
    public void display_small(){
        System.out.println(" 4.7 inches ");
    }
    public void chipset_powerful(){
        System.out.println(" Apple A13 Bionic ");
    }
    public void chipset_weak(){
        System.out.println(" Apple A8 Bionic ");
    }
    public void storage_big(){
        System.out.println(" 64GB/128GB/256GB");
    }
    public void storage_small(){
        System.out.println(" 16GB/32GB/64GB/128GB ");
    }
    public void weight_heavy(){
        System.out.println(" 194 g ");
    }
    public void weight_low(){
        System.out.println(" 129 g ");
    }
}