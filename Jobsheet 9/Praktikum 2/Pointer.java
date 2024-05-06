public class Pointer {
    String pertanyaan;
    String jawaban;
    Pointer next;
    public Pointer(String pertanyaan, String jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.next = null;
    }
}
