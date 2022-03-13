Feladatok
=========

Az alábbi feladatok megoldásához a JShellben hajtsuk végre az alábbi kódrészeket:
```java
import countries.*;
var countries = new CountryRepository().getAll();
```
A továbbiakban a `countries` változó értéke `Country` objektumok egy listája, ezt kell használni a megoldásokban.

Írj _stream_ csővezetéket, mely:

1. A konzolra írja az országok nevét.

1. A konzolra írja az országok fővárosainak nevét ábécé sorrendben. Vigyázat: a főváros lehet `null`.

1. A konzolra írja az országok fővárosainak nevét fordított ábécé sorrendben. Vigyázat: a főváros lehet `null`.

1. Visszaadja az országok lélekszámának maximumát.

1. Visszaadja az országok lélekszámának átlagát.

1. Összegző statisztikát ad vissza az országok lélekszámáról.

1. A konzolra írja az európai országok neveit.

1. Visszaadja az európai országok számát.

1. Visszaadja a független országok számát.

1. A konzolra írja a 100-nál kisebb lélekszámú országokat.

1. A konzolra írja a 100-nál kisebb lélekszámú országok neveit.

1. Visszaadja az európai országok lélekszámainak összegét.

1. A konzolra írja az európai országok lélekszámait növekvő sorrendben.

1. A konzolra írja az európai országok lélekszámait csökkenő sorrendben.

1. Visszaadja a legnagyobb lélekszámú európai országot.

1. Visszaadja a legnagyobb lélekszámú európai ország nevét.

1. A konzolra írja az első 5 ország nevét (használandó köztes művelet: [`limit`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#limit(long))).

1. Visszaadja, hogy van-e legalább egy olyan ország, melynek 0 a lélekszáma (használandó terminális művelet: [`anyMatch`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate))).

1. Visszaadja, hogy minden országhoz legalább egy időzóna tartozik-e (használandó terminális művelet: [`allMatch`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate))).

1. Visszaadja az első olyan országot, melynek neve 'H' betűvel kezdődik (használandó terminális művelet: [`findFirst`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#findFirst())).

1. Visszaadja az összes különböző időzóna számát (használandó köztes műveletek: [`flatMap`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#flatMap(java.util.function.Function)), [`distinct`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#distinct())).

1. A konzolra írja az európai országok összes különböző időzónáját (használandó köztes műveletek: [`flatMap`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#flatMap(java.util.function.Function)), [`distinct`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#distinct())).

1. A konzolra írja az országok nevét és lélekszámát lélekszám szerint csökkenő sorrendben.

1. Visszaadja, hogy hány karakterből áll a leghosszabb országnév.

1. A konzolra írja az országok fővárosainak nevét a hosszuk szerint növekvő sorrendben. Vigyázat: a főváros lehet `null`.

1. A konzolra írja az országok fővárosainak nevét a hosszuk szerint növekvő sorrendben, azon belül pedig ábécé sorrendben. Vigyázat: a főváros lehet `null`.
