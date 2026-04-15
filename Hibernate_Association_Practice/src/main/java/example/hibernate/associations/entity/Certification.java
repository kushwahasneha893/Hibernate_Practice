package example.hibernate.associations.entity;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Certification {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer certificationId;
        private String name;
        private List<Certification> certifications;
        
        public Certification() {}


        public Certification(Integer certificationId, String name, List<Student> students) {
                super();
                this.certificationId = certificationId;
                this.name = name;
                this.certifications = certifications;
        }
        @Override
        public String toString() {
                return "Certification [certificationId=" + certificationId + ", name=" + name + ", certification=" + certifications + "]";
        }
        public Integer getCertificationId() {
                return certificationId;
        }
        public void setCertificationId(Integer certificationId) {
                this.certificationId = certificationId;
        }
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public List<Certification> getStudents() {
                return certifications;
        }
        public void setStudents(List<Certification> students) {
                this.certifications = certifications;
        }
        public void addCertification(Certification certification) {
                certifications.add(certification);
        }
       
      

}

