package chapters.chapter_12.exercises_12.Exercise_09;

public class BinaryFormatException extends NumberFormatException {
    private String binaryString;

    public  BinaryFormatException(String binaryString) {
        super(binaryString + "is not binary");
        this.binaryString = binaryString;
    }

    public String getBinaryString(){
        return binaryString;
    }


}
