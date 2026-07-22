# Kurumsal Web Sitesi Backend

Spring Boot kullanılarak geliştirilen bu proje, kurumsal bir web sitesinin backend altyapısını oluşturmaktadır. Katmanlı mimari (Controller - Service - Repository) kullanılarak geliştirilen sistem, içerik yönetimi, haber yönetimi ve iletişim formu işlemlerini güvenli ve düzenli bir şekilde gerçekleştirmektedir.

## Projenin Amacı

Bu proje, kurumsal web sitelerinde yer alan dinamik içeriklerin yönetilebilmesi amacıyla geliştirilmiştir. Yönetim paneli üzerinden içeriklerin eklenmesi, güncellenmesi ve silinmesi sağlanırken, kullanıcı tarafında güncel içeriklerin görüntülenmesi hedeflenmiştir.

## Özellikler

- Ana sayfa içerik yönetimi
- Hakkımızda sayfası yönetimi
- Haber ekleme, güncelleme ve listeleme
- İletişim formu yönetimi
- Veritabanı işlemleri
- REST API desteği
- Katmanlı mimari yapısı

## Kullanılan Teknolojiler

- Java
- Spring Boot
- Maven
- REST API
- Katmanlı Mimari (Controller - Service - Repository)

## Katmanların Görevleri

- **Controller:** İstemciden gelen HTTP isteklerini karşılar.
- **Service:** İş kurallarını ve uygulama mantığını içerir.
- **Repository:** Veritabanı işlemlerini gerçekleştirir.
- **Entity:** Veritabanı tablolarını temsil eder.
- **DTO:** Katmanlar arasında veri taşınmasını sağlar.
- **Mapper:** Entity ve DTO nesneleri arasında dönüşüm yapar.

## Kurulum

```bash
git clone https://github.com/kullaniciadi/repository-adi.git

cd repository-adi

mvn clean install

mvn spring-boot:run
```

## Not

Bu repository yalnızca projenin **backend** kısmını içermektedir. Frontend uygulaması bu repository içerisinde yer almamaktadır.
