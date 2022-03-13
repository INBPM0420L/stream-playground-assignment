Feladatok
=========

Az alábbi feladatok megoldásához a JShellben hajtsuk végre az alábbi kódrészeket:
```java
import countries.*;
import static java.util.stream.Collectors.*;
var countries = new CountryRepository().getAll();
```
A továbbiakban a `countries` változó értéke `Country` objektumok egy listája, ezt kell használni a megoldásokban.

Írj _stream_ csővezetéket, mely:

1. Visszaadja a legnagyobb területű országot (óvatosan kell eljárni a területtel, mivel lehet `null`).

1. A konzolra írja a `null` területű országok nevét.

1. Összegző statisztikát ad vissza az országok területéről.

1. Visszaadja az országok területének összegét.

1. Visszaadja az ábécé sorrendbe rendezett országnevek vessző karakterekkel elválasztott listáját.

1. Visszaad egy, az országkód-országnév párokat tartalmazó asszociatív tömböt.

1. Visszaad egy asszociatív tömböt, mely lehetővé teszi az országok a kódjuk alapján történő hatékony elérését.

1. A konzolra írja a Magyarországnál kisebb vagy egyenlő lélekszámú országok nevét és lélekszámát lélekszám szerint csökkenő sorrendben.

1. Visszaadja az európai és nem európai országok számát.

1. Visszaadja földrészenként az országok listáját.

1. Visszaadja földrészenként az országok számát.

1. A konzolra írja az országok számát földrészenként.

1. Visszaadja földrészenként az országok átlagos lélekszámát.

1. Visszaadja földrészenként a legnépesebb országot.

1. Visszaadja földrészenként a legnagyobb lélekszámot.

1. Visszaadja földrészenként a leghosszabb országnevet.

1. Visszaadja az országok számát a nevük kezdőbetűje szerint csoportosítva.

1. Visszaadja, hogy van-e kettő vagy több azonos (nem `null`) területű ország.
