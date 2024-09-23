//imports for libraries and module




public class Pokemon {
    //global varbiles for the class
    //private -> because other files do not need to access these varible
    private String name,ht,wt,attack1Name,attack2Name,id,type,picture;
    private int hp, attack1Damage, attack2Damage;
    

    //Constructors - what is needed to have an object of this
    //no-arg Constructor 
    public Pokemon(){
        this.id="";
        this.type="";
        this.hp=0;
        this.name="";
        this.ht="";
        this.wt="";
        this.attack1Name="";
        this.attack1Damage=0;
        this.attack2Name=""; 
        this.attack2Damage=0;
        this.picture="";
    }
    public Pokemon(String id, String type, int hp, String name, String ht, String wt, String a1n, int a1d, String a2n, int a2d, String pic ){
        //this.fieldVaribleName = localVaribleNameFromConstructor;
        this.id=id;
        this.type=type;
        this.hp=hp;
        this.name=name;
        this.ht=ht;
        this.wt=wt;
        this.attack1Name=a1n;
        this.attack1Damage=a1d;
        this.attack2Name=a2n; 
        this.attack2Damage=a2d;
        this.picture=pic;
    }


    //getters and setters aka accessors and mutators
    public String getName(){
        return this.Name;
    }
    public void setName(String newName){
        this.Name = newName;
    }
    public String getID(){
        return this.id;
    }
    public void setID(String newID){
        this.id = newID;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String newType){
        this.Name = newType;
    }
    public int getHP(){
        return this.hp;
    }
    public void setHP(int newHP){
        this.hp = newHP;
    }
    public String getHt(){
        return this.Name;
    }
    public void setHt(String newHeight){
        this.height = newHeight;
    }
    public String getWt(){
        return this.Name;
    }
    public void setWt(String newWeight){
        this.weight = newWeight;
    }
    public String getA1N(){
        return this.attack1Name;
    }
    public void setA1N(String newA1N){
        this.attack1Name = newA1N;
    }
    public int getA1D(){
        return this.attack1damage;
    }
    public void setA1D(int newA1D){
        this.attack1damage = newA1D;
    }
    public String getA2N(){
        return this.attack1Name;
    }
    public void setA2N(String newA2N){
        this.attack2Name = newA2N;
    }
    public int getA2D(){
        return this.attack1damage;
    }
    public void setA2D(int newA2D){
        this.attack2damage = newA2D;
    }
    public String getPic(){
        return this.picture;
    }
    public void setPic(String newPicture){
        this.picture = newPicture;
    }
   

    //methods for the object

    //toString method - anytime you print the object, this is what will render
    @Override //decorator - over writing the toString f(x) from the super class
    public String toString() {
        return "\nIndex: " + id +
               "\nName: " + name +
               "\nType: " + type +
               "\nHP: " + hp +
               "\nHeight: " + ht + " m" +
               "\nWeight: " + wt + " kg" +
               "\nAttack 1: " + attack1Name + " (Power: " + attack1Damage + ")" +
               "\nAttack 2: " + attack2Name + " (Power: " + attack2Damage+ ")";
    }


}
