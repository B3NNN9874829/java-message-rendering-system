package DP2;

public class SendableDecorator implements Sendable {
    protected Sendable wrappee;

    public SendableDecorator(Sendable wrappee) {
        this.wrappee = wrappee;
    }

    public User getSender() {
        return wrappee.getSender();
    }

    public User getReciever() {
        return wrappee.getReciever();
    }

    public String getContent() {
        return wrappee.getContent();
    }
    //1 1. Apakah objek dari kelas SendableDecorator dalam dibungkus kembali oleh objek lain dari kelas SendableDecorator? Jelaskan mengapa!

    //Ya, objek dari kelas SendableDecorator dapat dibungkus kembali oleh objek lain dari kelas SendableDecorator. Hal ini karena SendableDecorator mengimplementasikan interface Sendable, sehingga dapat diperlakukan sama seperti objek Message. Dengan demikian, decorator dapat saling membungkus untuk menambahkan perilaku secara bertahap tanpa mengubah kode yang sudah ada.

    //2 Sesuai kode di atas, apakah pemanggilan method getSender() pada objek dari kelas keturunan dari kelas SendableDecorator, yang membungkus objek kelas Message, akan menghasilkan hal yang berbeda dengan pemanggilan method getSender() dari objek kelas Message secara langsung? Jelaskan mengapa!

   
    // Tidak, pemanggilan getSender() pada objek turunan SendableDecorator yang membungkus Message tidak menghasilkan nilai yang berbeda dibanding pemanggilan getSender() langsung pada Message. Hal ini karena method getSender() pada SendableDecorator hanya mendelegasikan pemanggilan ke objek wrappee melalui wrappee.getSender(), sehingga nilai sender yang dikembalikan tetap sama.
}
