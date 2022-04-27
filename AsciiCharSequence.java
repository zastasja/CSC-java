public class AsciiCharSequence implements CharSequence {
    private byte[] str;

    public AsciiCharSequence(byte[] str){
        this.str = str;
    }

    @Override
    public int length() {
        return str.length;
    }

    @Override
    public char charAt(int index) {
        return (char) str[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
    int len = end - start;
    byte[] bytes = new byte[len];
    for (int i = 0, j = start; i<len; i++, j++){
        bytes[i] = str[j];
    }
        return new AsciiCharSequence(bytes);
    }

    @Override
    public String toString(){
        return new String(str);
    }
}
