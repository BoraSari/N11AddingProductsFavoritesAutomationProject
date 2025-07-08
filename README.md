N11 Adding Products Favorites Automation Project
Project Overview
This project provides an automated test suite for key user flows on the N11 e-commerce website, including user login, navigation to the electronics category, verification of product details (specifically price), and adding products to a user's favorites list. Developed using Java, Selenium WebDriver, and TestNG, it demonstrates robust test automation practices, including the Page Object Model (POM) and secure handling of sensitive data via environment variables (dotenv).

Project Goal
The main objectives of this project are to:

Automate the user login process to the N11 website using securely stored credentials.

Navigate to the electronic products category.

Simulate user interaction by scrolling the page and selecting a specific product.

Verify the correct display and value of a product's price on its details page.

Automate the process of adding a product to the user's favorites list.

Confirm the successful addition of the product to favorites by verifying a confirmation message or element.

Showcase proficiency in Java, Selenium WebDriver, and TestNG for comprehensive e-commerce test automation.

Technologies Used
Programming Language: Java

Test Automation Framework: Selenium WebDriver

Testing Framework: TestNG

Environment Variables: io.github.cdimascio.dotenv.Dotenv (for managing sensitive data like email/password)

Design Pattern: Page Object Model (POM)

Logging: org.testng.log4testng.Logger

Setup and Run Instructions
To set up and run this project locally, follow these steps:

Clone the Repository:

git clone https://github.com/BoraSari/N11AddingProductsFavoritesAutomationProject.git
cd N11AddingProductsFavoritesAutomationProject

(Note: Replace BoraSari with your actual GitHub username if different. Adjust the repository name if it's different in your actual GitHub setup.)

Prerequisites:

Ensure Java Development Kit (JDK) 8 or higher is installed.

Have Maven (or Gradle) installed and configured for dependency management.

Download the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver) for your browser and ensure it's accessible by your test environment (e.g., via WebDriverManager or system PATH).

Ensure BaseTest class correctly initializes the WebDriver.

Configure Environment Variables:
Create a .env file in the root directory of the project and add your N11 login credentials:

EMAIL="your_valid_email@example.com"
PASSWORD="your_valid_password"

Make sure not to commit this .env file to your public repository! Add it to your .gitignore.

Build the Project:

mvn clean install

(If using Gradle, replace mvn commands with gradle commands.)

Run the Tests:
Tests are configured with TestNG priorities. You can run them via a TestNG XML suite or directly from your IDE (e.g., IntelliJ IDEA, Eclipse).

Example testng.xml:

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="N11 Product Favorites Test Suite">
    <test name="Product Favorites Tests">
        <classes>
            <class name="N11Tests.N11Tests"/> <!-- Replace with your actual test class -->
        </classes>
    </test>
</suite>

Run with Maven:

mvn test -DsuiteXmlFile=testng.xml

Or run directly from your IDE.

Test Coverage and Scenarios
This project covers the following key scenarios for N11:

loginTest (Priority 1):

Description: Automates the login process to the N11 website using credentials loaded from .env file, ensuring secure handling of sensitive data.

Flow: Navigates to the N11 main page, proceeds to the login section, enters email and password, and clicks the login button.

navigateElectronicCategoryTest (Priority 2):

Description: Automates navigation to the electronic products category, simulates page scrolling, and selects a product to view its details.

Flow: Navigates to the electronic category, scrolls down the page to load more products, and then clicks on a selected product.

checkProductPriceAssertionTest (Priority 3):

Description: Verifies the correct display and value of the product price on the product details page.

Flow: Navigates to the product details page (after selecting a product), asserts that the product price element is displayed, and that its text value matches the expected price (e.g., "49.459 TL").

addingProductFavorites (Priority 4):

Description: Automates the process of adding the selected product to the user's favorites list and verifies the success message.

Flow: On the product details page, clicks the "Add to Favorites" button, and then asserts that a confirmation message or element indicating successful addition to favorites is displayed.

Screenshots/GIFs
(Please add screenshots or GIFs here demonstrating the test execution for various scenarios, such as successful login, navigation to electronics, product details page with price, and the "added to favorites" confirmation, to visually showcase the project's functionality.)

License
This project is licensed under the MIT License - see the LICENSE file for details.

N11 Ürünleri Favorilere Ekleme Otomasyon Projesi
Projeye Genel Bakış
Bu proje, N11 e-ticaret web sitesindeki temel kullanıcı akışları için otomatik bir test paketi sunar; kullanıcı girişi, elektronik kategorisine navigasyon, ürün detaylarının (özellikle fiyatın) doğrulanması ve ürünlerin kullanıcının favoriler listesine eklenmesi gibi adımları içerir. Java, Selenium WebDriver ve TestNG kullanılarak geliştirilen bu proje, Page Object Model (POM) ve ortam değişkenleri (dotenv) aracılığıyla hassas verilerin güvenli bir şekilde işlenmesi gibi sağlam test otomasyonu uygulamalarını göstermektedir.

Proje Amacı
Bu projenin temel hedefleri şunlardır:

N11 web sitesine kullanıcı giriş sürecini güvenli bir şekilde saklanan kimlik bilgileriyle otomatikleştirmek.

Elektronik ürünler kategorisine gitmek.

Sayfayı kaydırarak ve belirli bir ürünü seçerek kullanıcı etkileşimini simüle etmek.

Bir ürünün detay sayfasındaki fiyatının doğru görüntülendiğini ve değerini doğrulamak.

Seçilen ürünü kullanıcının favoriler listesine ekleme sürecini otomatikleştirmek.

Bir onay mesajı veya öğesi doğrulayarak ürünün favorilere başarılı bir şekilde eklendiğini onaylamak.

Kapsamlı e-ticaret test otomasyonu için Java, Selenium WebDriver ve TestNG'deki yetkinliği sergilemek.

Kullanılan Teknolojiler
Programlama Dili: Java

Test Otomasyon Çerçevesi: Selenium WebDriver

Test Çerçevesi: TestNG

Ortam Değişkenleri: io.github.cdimascio.dotenv.Dotenv (e-posta/parola gibi hassas verileri yönetmek için)

Tasarım Deseni: Page Object Model (POM)

Günlük Kaydı: org.testng.log4testng.Logger

Kurulum ve Çalıştırma Talimatları
Bu projeyi yerel olarak kurmak ve çalıştırmak için aşağıdaki adımları izleyin:

Depoyu Klonlayın:

git clone https://github.com/BoraSari/N11AddingProductsFavoritesAutomationProject.git
cd N11AddingProductsFavoritesAutomationProject

(Not: BoraSari yerine gerçek GitHub kullanıcı adınızı yazın. GitHub'daki gerçek kurulumunuz farklıysa depo adını ayarlayın.)

Ön Koşullar:

Java Development Kit (JDK) 8 veya daha yüksek bir sürümün yüklü olduğundan emin olun.

Maven (veya Gradle) yüklü ve bağımlılık yönetimi için yapılandırılmış olmalıdır.

Tarayıcınız için uygun WebDriver'ı (örn: ChromeDriver, GeckoDriver) indirin ve test ortamınız tarafından erişilebilir olduğundan emin olun (örn: WebDriverManager veya sistem PATH aracılığıyla).

BaseTest sınıfının WebDriver'ı doğru bir şekilde başlattığından emin olun.

Ortam Değişkenlerini Yapılandırın:
Projenin kök dizininde bir .env dosyası oluşturun ve N11 giriş kimlik bilgilerinizi ekleyin:

EMAIL="gecerli_eposta_adresiniz@ornek.com"
PASSWORD="gecerli_parolaniz"

Bu .env dosyasını herkese açık deponuza yüklememeye dikkat edin! .gitignore dosyanıza ekleyin.

Projeyi Derleyin:

mvn clean install

(Gradle kullanıyorsanız, mvn komutlarını gradle komutlarıyla değiştirin.)

Testleri Çalıştırın:
Testler TestNG öncelikleriyle yapılandırılmıştır. Testleri bir TestNG XML paketi aracılığıyla veya doğrudan IDE'nizden (örn: IntelliJ IDEA, Eclipse) çalıştırabilirsiniz.

Örnek testng.xml:

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="N11 Ürün Favorileri Test Paketi">
    <test name="Ürün Favorileri Testleri">
        <classes>
            <class name="N11Tests.N11Tests"/> <!-- Replace with your actual test class -->
        </classes>
    </test>
</suite>

Maven ile çalıştırma:

mvn test -DsuiteXmlFile=testng.xml

Veya doğrudan IDE'nizden çalıştırın.

Test Kapsamı ve Senaryoları
This project covers the following key scenarios for N11:

loginTest (Öncelik 1):

Açıklama: .env dosyasından yüklenen kimlik bilgileriyle N11 web sitesine giriş sürecini otomatize eder, hassas verilerin güvenli bir şekilde işlenmesini sağlar.

Akış: N11 ana sayfasına gider, giriş bölümüne ilerler, e-posta ve parolayı girer ve giriş düğmesine tıklar.

navigateElectronicCategoryTest (Öncelik 2):

Açıklama: Elektronik ürünler kategorisine navigasyonu otomatize eder, sayfa kaydırmayı simüle eder ve detaylarını görüntülemek için bir ürün seçer.

Akış: Elektronik kategorisine gider, daha fazla ürün yüklemek için sayfayı aşağı kaydırır ve ardından seçilen bir ürüne tıklar.

checkProductPriceAssertionTest (Öncelik 3):

Açıklama: Ürün detay sayfasındaki ürün fiyatının doğru görüntülendiğini ve değerini doğrular.

Akış: Ürün detay sayfasına gider (bir ürün seçildikten sonra), ürün fiyatı öğesinin görüntülendiğini ve metin değerinin beklenen fiyatla (örn: "49.459 TL") eşleştiğini doğrular.

addingProductFavorites (Öncelik 4):

Açıklama: Seçilen ürünü kullanıcının favoriler listesine ekleme sürecini otomatize eder ve başarı mesajını doğrular.

Akış: Ürün detay sayfasında "Favorilere Ekle" düğmesine tıklar ve ardından favorilere başarılı bir şekilde eklendiğini gösteren bir onay mesajının veya öğesinin görüntülendiğini doğrular.

Ekran Görüntüleri/GIF'ler
![image](https://github.com/user-attachments/assets/6e0ac4ff-5660-483c-bd3f-19884e6704e5)



License
This project is licensed under the MIT License - see the LICENSE file for details.
