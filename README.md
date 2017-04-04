# Spring Boot With Lombok Project

[projectlombok.org](https://projectlombok.org/) digunakan untuk menyederhanakan enkapsulasi 
di bahasa pemograman berbasis Java (we called setter & getter), biasanya klo kita koding Java kita harus
mengepkasulasi atribut dalam sebuah kelas dengan menggunakan method setter ataupun getter. Jadi kekurangannya jika kita 
menambahkan sebuah artribut dalam kelas tersebut kita harus nulis atau generate lagi method setter & getternya atau menambahkan ke contruktor.

## Membuat project menggunakan Spring Boot di IntelliJ IDEA.

1. New Project -> Spring Initialzr

![create-new-project](docs/images/1.%20springboot-lombok-new-project.png)

2. Next -> Setting maven configurasi seperti berikut:

![maven-configure](docs/images/2.%20springboot-lombok-maven-config.png)

3. Next -> Tambahkan dependency Lombok Project

![maven-dependency](docs/images/3.%20springboot-lombok-dependency-mangement.png)

4. Next -> Lokasi project

![location-project](docs/images/4.%20springboot-lombok-project-location.png)

5. Finish

Maka berikut struktur direktory project

```bash
dimmaryanto93@E5-473G:~/Documents/belajar/springboot-lombok$ tree .
.
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── springboot-lombok.iml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── dimmaryanto93
    │   │           └── engineer
    │   │               └── SpringApplicationRunner.java
    │   └── resources
    │       └── application.properties
    └── test
```

