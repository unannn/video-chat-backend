package capstone.videochat.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user") //컬렉션 이름
public class User {
    @Id
    String id; //PRIMARY KEY
    String password;
    String name;
    String major;
    String studentId;
    byte[] faceImage_1;
    byte[] faceImage_2;
    byte[] faceImage_3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public byte[] getFaceImage_1() {
        return faceImage_1;
    }

    public void setFaceImage_1(byte[] faceImage_1) {
        this.faceImage_1 = faceImage_1;
    }

    public byte[] getFaceImage_2() {
        return faceImage_2;
    }

    public void setFaceImage_2(byte[] faceImage_2) {
        this.faceImage_2 = faceImage_2;
    }

    public byte[] getFaceImage_3() {
        return faceImage_3;
    }

    public void setFaceImage_3(byte[] faceImage_3) {
        this.faceImage_3 = faceImage_3;
    }

}
