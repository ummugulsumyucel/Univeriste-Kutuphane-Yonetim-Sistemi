-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 03 Oca 2024, 12:22:47
-- Sunucu sürümü: 10.4.32-MariaDB
-- PHP Sürümü: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `demo`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminler`
--

CREATE TABLE `adminler` (
  `username` text NOT NULL,
  `password` text NOT NULL,
  `tip` varchar(10) NOT NULL DEFAULT 'admin'
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`username`, `password`, `tip`) VALUES
('ahmetagziguzel', '12345', 'admin'),
('ytzibrahim', '12345', 'admin'),
('dumanyusuf', '12345', 'admin'),
('rbvc', '12345', 'admin');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kitaplar`
--

CREATE TABLE `kitaplar` (
  `id` int(11) NOT NULL,
  `kitap_adi` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `yazar` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `kitap_konu` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `tarih` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `durum` varchar(255) DEFAULT 'RAFTA'
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `kitaplar`
--

INSERT INTO `kitaplar` (`id`, `kitap_adi`, `yazar`, `kitap_konu`, `tarih`, `durum`) VALUES
(1, 'Don Kişot', 'Miguel de Cervantes', 'Klasik', '1605', 'RAFTA'),
(2, 'Romeo ve Juliet', 'William Shakespeare', 'Bilim Kurgu', '1597', 'RAFTA'),
(3, 'Sefiller', 'Victor Hugo', 'Klasik', '1862', 'RAFTA'),
(4, 'Suç ve Ceza', 'Fyodor Dostoevsky', 'Klasik', '1866', 'RAFTA'),
(5, 'Karamazov Kardeşler', 'Fyodor Dostoevsky', 'Klasik', '1880', 'RAFTA'),
(6, 'Yeraltından Notlar', 'Fyodor Dostoevsky', 'Klasik', '1864', 'RAFTA'),
(7, 'Les Misérables', 'Victor Hugo', 'Klasik', '1862', 'RAFTA'),
(8, 'War and Peace', 'Lev Tolstoy', 'Klasik', '1869', 'RAFTA'),
(9, '1984', 'George Orwell', 'Distopya', '1949', 'RAFTA'),
(10, 'Brave New World', 'Aldous Huxley', 'Distopya', '1932', 'RAFTA'),
(11, 'The Catcher in the Rye', 'J.D. Salinger', 'Roman', '1951', 'RAFTA'),
(12, 'To Kill a Mockingbird', 'Harper Lee', 'Drama', '1960', 'RAFTA'),
(13, 'The Great Gatsby', 'F. Scott Fitzgerald', 'Roman', '1925', 'RAFTA'),
(14, 'Pride and Prejudice', 'Jane Austen', 'Romantizm', '1813', 'RAFTA'),
(15, 'One Hundred Years of Solitude', 'Gabriel Garcia Marquez', 'Büyülü Gerçekçilik', '1967', 'RAFTA'),
(16, 'The Hobbit', 'J.R.R. Tolkien', 'Fantastik', '1937', 'RAFTA'),
(17, 'The Lord of the Rings: The Fellowship of the Ring', 'J.R.R. Tolkien', 'Fantastik', '1954', 'RAFTA'),
(18, 'The Lord of the Rings: The Two Towers', 'J.R.R. Tolkien', 'Fantastik', '1954', 'RAFTA'),
(19, 'The Lord of the Rings: The Return of the King', 'J.R.R. Tolkien', 'Fantastik', '1955', 'RAFTA'),
(20, 'The Silmarillion', 'J.R.R. Tolkien', 'Fantastik', '1977', 'RAFTA'),
(21, 'Unfinished Tales', 'J.R.R. Tolkien', 'Fantastik', '1980', 'RAFTA');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `id` int(11) NOT NULL,
  `ad_soyad` varchar(255) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `tip` varchar(10) NOT NULL DEFAULT 'kullanici'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`id`, `ad_soyad`, `username`, `password`, `tip`) VALUES
(1, 'Rıdvan Bekleviç', 'ibocan', '123', 'kullanici'),
(2, 'ibrahim Yitiz', 'yitiz123', '123', 'kullanici'),
(3, 'yusuf duman', 'duman', '123', 'kullanici'),
(4, 'Rıdvan Bekleviç', 'rbvc12', '12345', 'kullanici');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `odunc_tablosu`
--

CREATE TABLE `odunc_tablosu` (
  `odunc_id` int(11) NOT NULL,
  `odunc_kitap_adi` varchar(255) NOT NULL,
  `odunc_yazar` varchar(100) DEFAULT NULL,
  `odunc_kitap_konu` varchar(255) DEFAULT NULL,
  `odunc_tarih` varchar(55) DEFAULT NULL,
  `durum` varchar(255) DEFAULT 'ÖDÜNÇ ALINDI'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kitaplar`
--
ALTER TABLE `kitaplar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Tablo için indeksler `odunc_tablosu`
--
ALTER TABLE `odunc_tablosu`
  ADD PRIMARY KEY (`odunc_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kitaplar`
--
ALTER TABLE `kitaplar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Tablo için AUTO_INCREMENT değeri `odunc_tablosu`
--
ALTER TABLE `odunc_tablosu`
  MODIFY `odunc_id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
