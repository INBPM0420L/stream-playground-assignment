Feladatok
=========

Az alábbi feladatok megoldásához a JShellben hajtsuk végre az alábbi kódrészeket:
```java
import countries.*;
var countries = new CountryRepository().getAll();
```
A továbbiakban a `countries` változó értéke `Country` objektumok egy listája, ezt kell használni a megoldásokban.

Írj _stream_ csővezetéket, mely:

1. Visszaadja, hogy van-e legalább egy olyan ország, melynek neve tartalmazza az _island_ szót. A vizsgálat kisbetű-nagybetű érzéketlen módon kell, hogy történjen.

1. Visszaadja az első olyan országnevet, mely tartalmazza az _island_ szót. A vizsgálat kisbetű-nagybetű érzéketlen módon kell, hogy történjen.

1. A konzolra írja az összes olyan országnevet, melyekben az első és az utolsó karakter azonos. A karakterek hasonlítása kisbetű-nagybetű érzéketlen módon kell, hogy történjen.

1. A konzolra írja a tíz legkisebb lélekszámú országot (szükséges köztes műveletek: [`mapToLong`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#mapToLong(java.util.function.ToLongFunction)), [`sorted`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#sorted()), [`limit`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#limit(long))).

1. A konzolra írja a tíz legkisebb lélekszámú ország nevét (szükséges köztes műveletek: [`sorted`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#sorted(java.util.Comparator)), [`limit`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#limit(long))).

1. Összegző statisztikát ad vissza az egyes országokhoz tartozó országnév fordítások számáról (szükséges köztes műveletek: [`mapToInt`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#mapToInt(java.util.function.ToIntFunction)), [`summaryStatistics`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/IntStream.html#summaryStatistics())).

1. A konzolra írja az országok nevét az időzónáik száma szerint növekvő sorrendben.

1. A konzolra írja minden egyes országhoz az időzónái számát _név_`: `_időzónák_ alakban az időzónák számának növekvő sorrendjében.

1. Visszaadja azoknak az országoknak a számát, melyeknek nincs spanyol neve (a spanyol nyelvet az `"es"` nyelvkód azonosítja).

1. A konzolra írja a `null` területű országok nevét.

1. A konzolra írja az országnév fordításoknál használt összes nyelvkódot ábécé sorrendben (szükséges köztes művelet: [`flatMap`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#flatMap(java.util.function.Function))).

1. Visszaadja az országnevek átlagos hosszát.

1. A konzolra írja a `null` területű országok összes különböző földrészét.

1. Visszaadja a legnagyobb (nem `null`) területű országot.

1. A konzolra írja az egynél kisebb (nem `null`) területű országok nevét.

1. A konzolra írja az európai és ázsiai országok összes különböző időzónáját (szükséges köztes művelet: [`flatMap`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#flatMap(java.util.function.Function))).
