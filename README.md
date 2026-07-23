## Proje Hakkında
 
**Kurumsal Site Backend**, kurumsal bir web sitesinin dinamik içeriklerini (haberler, kurslar, hakkımızda, iletişim formu vb.) yönetmek için geliştirilmiş bir REST API'dir. **Controller – Service – Repository** katmanlı mimarisi ile geliştirilmiş olup Entity ↔ DTO dönüşümleri ayrı bir **Mapper** katmanı üzerinden yönetilir.
 



<img width="1920" height="1966" alt="anasayfa - Kopya" src="https://github.com/user-attachments/assets/98825e50-2041-463b-8349-da2fc2d7842b" />



##  Özellikler
 
- 📰 Haber ekleme, güncelleme, listeleme ve silme
- 📚 Kurs ve kurs detay yönetimi
- 👥 Hakkımızda içerik yönetimi
- ✉️ İletişim formu kayıtlarının yönetimi
- 🔗 Sosyal medya / dış bağlantı (Links) yönetimi
- 🧱 Temiz, katmanlı ve genişletilebilir mimari
- 🔄 Entity–DTO dönüşümleri için özel Mapper sınıfları


## 🛠️ Kullanılan Teknolojiler
 
| Katman | Teknoloji |
|---|---|
| Dil | Java |
| Framework | Spring Boot (Spring Web, Spring Data JPA) |
| Veritabanı Erişimi | Jakarta Persistence (JPA) |
| Kod Sadeleştirme | Lombok |
| Build Aracı | Maven |
| Mimari | Katmanlı Mimari (Controller – Service – Repository – Entity – DTO – Mapper) |
 


## Katmanların Görevleri

- **Controller:** İstemciden gelen HTTP isteklerini karşılar.
- **Service:** İş kurallarını ve uygulama mantığını içerir.
- **Repository:** Veritabanı işlemlerini gerçekleştirir.
- **Entity:** Veritabanı tablolarını temsil eder.
- **DTO:** Katmanlar arasında veri taşınmasını sağlar.
- **Mapper:** Entity ve DTO nesneleri arasında dönüşüm yapar.


## 🧩 Katmanların Görevleri
 
| Katman | Görev |
|---|---|
| **Controller** | İstemciden gelen HTTP isteklerini karşılar |
| **Service** | İş kurallarını ve uygulama mantığını içerir |
| **Repository** | Spring Data JPA ile veritabanı işlemlerini gerçekleştirir |
| **Entity** | Veritabanı tablolarını temsil eder |
| **DTO** | Katmanlar arasında veri taşınmasını sağlar |
| **Mapper** | Entity ve DTO nesneleri arasında dönüşüm yapar |



> ⚠️ Bu depo yalnızca **backend** kaynak kodlarını içerir; frontend uygulaması bu depoda yer almaktadır.
