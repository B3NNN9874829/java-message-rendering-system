package DP2;

public class MessageWithVideo extends SendableDecorator {

    public MessageWithVideo(Sendable wrappee) {
        super(wrappee);
        // TODO Auto-generated constructor stub
    }

    private Video video;

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
    // Apakah suatu objek kelas Message dapat ditambahkan sebuah gambar dan sekaligus sebuah video dengan mekanisme decorator yang Anda telah buat tanpa menambahkan decorator baru? Jelaskan bagaimana Anda dapat melakukan hal tersebut?
    
    //Bisa kita akan membungkus si obj berkali kali 
}
