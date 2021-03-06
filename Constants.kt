package com.example.examen.models

import com.example.examen.Category2
import com.example.examen.R

class Constants {
    companion object{
        val categories= arrayListOf(
        Category (Category2.Domestic.ordinal, R.string.domestic),
        Category (Category2.Hollywood.ordinal,R.string.hollywood),
        Category(Category2.Kpop.ordinal,R.string.kpop)
        )
        val news= arrayListOf(
            News(
                Category2.Domestic.ordinal,
                "https://st-1.akipress.org/st_limon/5/1540540259_0.jpg",
                "Звезды кыргызского шоу-бизнеса, которые породнились после свадьбы",
                " Популярный певец Мирбек Атабеков и его супруга Мээрим Толепберген дважды стали окул ата и окул апа звездам кыргызской эстрады." +
                        "Их первыми «детьми» стали певец Бек Исраилов и его очаровательная жена Айжаркын Карыбаева. Вторыми – солисты группы Style Mix Адилет Эркинбеков и" +
                        " Илима Дуйшеналиева. " +
                        "А сестрой Илимы является популярная певица Назгуль Токтакунова, которая встречалась длительное время с певцом Айбеком Замировым."
            ),
            News(
                Category2.Domestic.ordinal,
                "https://sputnik.kg/img/07e4/0c/1a/1050913230_0:0:3072:1728_1920x0_80_0_0_084079557804e4f83a0fc87c9965b8e9.jpg.webp",
                "Успех кыргызстанского исполнителя на шоу Голос",
                " Кыргызстанец исполнил казачью песню «Черный ворон». Существует множество вариантов песни, первый опубликован в XIX веке. В 1934 году песня прозвучала в фильме «Чапаев» в аранжировке Гавриила Попова.\n" +
                        "Финал проекта состоится 30 декабря в 00.30 по бишкекскому времени."
            ),
            News(
                Category2.Domestic.ordinal,
                "http://st-0.akipress.org/127/.storage/limon2/images/avgust2015/1c22ecea661bcac3949552bbd021e786.jpg",
                "В какой акции принимают участие звезды Кыргызстана? ",
                " Юная и одаренная исполнительница, безоговорочно покорившая нас своим талантом, Айыма Айылчиева на своей страничке в Instagram поделилась фотографией и сообщила, что оно с места съемок нового клипа.\n" +
                        "«На съемках очередного клипа, ждите друзья, очень надеюсь на вашу поддержку, конечно немного волнуюсь," +
                        " но очень надеюсь, что вам понравится, люблю, целую, ваша Айым»."
            ),
            News(
                Category2.Hollywood.ordinal,
                "https://img.pravda.ru/image/photo/4/4/8/196448.jpeg",
                "Энн Хэтэуэй еще долго не сможет рекламировать шампуни" ,
                        "Свои чудесные волосы актриса возложила на жертвенный алтарь искусств.Она долго не могла прийти в себя после расставания" +
                                " со своей копной волос, которую ей пришлось отстричь для роли в проекте \"Отверженные\n"

            ),
            News(
                Category2.Hollywood.ordinal,
                "https://img.pravda.ru/image/photo/4/5/0/196450.jpeg",
                "Самый известный саентолог Голливуда Том Круз преображается на глазах во время съемок нового фильма \"Все, что тебе нужно - это убивать\" в Лондоне.\n" ,
                "Удивленные жители английской столицы и туристы вместе с ними смогли наблюдать, как в самом сердце города - на Трафальгарской площади, разворачиваются самые что ни на есть \"военные действия\". И, конечно же, с Томом в главной роли\n"
                                    ),
            News(
                Category2.Hollywood.ordinal,
                "https://img.pravda.ru/image/photo/4/5/2/196452.jpeg",
                "Роберт Паттинсон пригласил Кристен Стюарт провести День благодарения с его семьей в Великобритании. Папарацци \"подловили\" парочку по возвращению в Нью-Йорк.\n" ,
                "Роб, похоже, совсем простил свою \"неверную\" подругу: да и его близкие встали на сторону пары - это День благодарения Стюарт и Паттинсон провели с семьей актера."
            ),
            News(
                Category2.Kpop.ordinal,
                "https://www.allkpop.com/upload/2021/01/content/070210/1610003403-times-twice-momo-and-super-junior-heechul-choose-each-other.jpg",
                "Новость об отношениях Момо из TWICE и Хичоля из Super Junior" ,
                "2 января 2020 года появились сообщения о том, что Хичоль из Super Junior и Момо из TWICE встречаются. СМИ Market News впервые поделились новостью об их отношениях в августе 2019 года, но лейблы артистов опровергли ее. " +
                        "Однако на этот раз их отношения подтвердили как Label SJ, так и JYP Entertainment."
            ),
            News(
                Category2.Kpop.ordinal,
                "https://www.allkpop.com/upload/2021/01/content/070210/1610003433-egam2rgu8aynimd.jpg",
                "BTS заняли первое место в Billboard Hot 100" ,
                "В августе BTS выпустили свой первый полностью англоязычный сингл «Dynamite». Он дебютировал в Billboard Hot 100 под номером один в сентябре, став первым хитом номер один в Соединенных Штатах. Он также ознаменовал собой дебют южнокорейской группы в чарте синглов Billboard Hot 100 под номером один. Ранее рекорд принадлежал PSY, когда он дебютировал в чарте на втором месте. Месяц спустя ремикс BTS на песню " +
                        "«Savage Love (Laxed — Siren Beat)» Джейсона Деруло и Jawsh 685 занял первую позицию в чарте Billboard Hot 100."
            ),
            News(
                Category2.Kpop.ordinal,
                "https://www.allkpop.com/upload/2021/01/content/070213/1610003618-blackpink-light-up-the-sky-documentary-to-be-released-exclusively-on-netflix.jpg",
                "BLACKPINK стали ключевой фигурой в документальном фильме о к-попе от Netflix" ,
                "Документальный фильм рассказывает о последних четырех годах карьеры девушек — с 2016 по 2020 год. В нем освещаются трудности, с которыми столкнулись девушки, рассказывается о годах их стажировки, а также показывается закулисье самой популярной женской группы в мире" +
                        " к-попа. Также более подробно рассказывается о подготовке их культового выступления в 2019 году на Coachella."
            )
        )
    }
}
