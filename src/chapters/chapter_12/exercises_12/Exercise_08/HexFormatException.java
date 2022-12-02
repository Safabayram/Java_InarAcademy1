package chapters.chapter_12.exercises_12.Exercise_08;

public class HexFormatException  extends NumberFormatException{
    private String hex;

    public HexFormatException(String hex){
        super(hex + " is not hex string");
        this.hex = hex;
    }
    public String getHex(){
        return hex;
    }

}
