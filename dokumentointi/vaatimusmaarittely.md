# Vaatimusmäärittely

## Soveluksen tarkoitus

Sovelluksen avulla käyttäjä voi määritellä itselleen _vakavaraisuustarpeen_. Tämä tarkoittaa sitä, että käyttäjä muodostaa itselleen taseen, joka koostuu varallisuudesta (asunto, osakkeet...) ja veloista (lainat etc.). Lisäksi velkapuolella näkyy käyttäjän odotettujen tulevien nettotuottojen nykyarvo. Täten käyttäjän markkinaehtoinen nettovarallisuus on: Nettovarallisuus = Varat - Lainat - odotettu nettotulot.

Tämän lisäksi käyttäjälle lasketaan pääomatarve, joka muodostuu varallisuuden ja odotettujen nettotulojen menettämisestä 1/200 todennäköisyydellä.

Kun vakavaraisuus asema on määritelty, voi käyttäjä opimoida varallisuuden sijoittamista joko riskillisemmin tai vähemmän riskillisesti, riippuen käyttäjän mieltymyksistä.

## Käyttäjät

Sovelluksella on yksi käyttäjä. Mutta parametrit on asetettu etukäteen _pääkäyttäjän_ roolissa.
Sovellukseen voi myöhemmin luoda useita käyttäjiä.

## Käyttöliittymäluonnos

Sovellus koostuu kolmesta eri näkymästä

<img src="https://github.com/samilait/otm-harjoitustyo/blob/master/dokumentointi/kuvat/GUI_Luonnos.JPG" width="750">

Sovellus aukeaa kirjautumisnäkymään, josta on mahdollista siirtyä uuden käyttäjän luomisnäkymään tai onnistuneen kirjautumisen yhteydessä kirjaantuneen käyttäjän tehtävälistaan.

## Perusversion tarjoama toiminnallisuus

### Ennen kirjautumista

- käyttäjä voi luoda järjestelmään käyttäjätunnuksen
  - käyttäjätunnuksen täytyy olla uniikki ja pituudeltaan vähintään 4 merkkiä

- käyttäjä voi kirjautua järjestelmään
  - kirjautuminen onnistuu syötettäessä olemassaoleva käyttäjätunnus kirjautumislomakkeelle
  - jos käyttäjää ei olemassa, ilmoittaa järjestelmä tästä

### Kirjautumisen jälkeen

- Varallisuus ja lainat: Käyttäjä voi valita taseeseensa varallisuuslajeja esim. asunto ja asettaa niiden markkina-arvon.

- Jos varallisuus on jo aikaisemmin asetettu käyttäjän tase ladataan kirjautuessa ja käyttäjä voi tehdä päivityksiä.

- Odotettujen nettotuottojen laskemista varten käyttäjä syöttää: odotetun nettopalkan, odotetut vuosimenot, tuotot sijoituksista, iän, sukupuolen, asuinpaikan ja koulutuksen.

- Käyttäjä voi laskea vakavaraisuusasemansa

- Ja myöhemmässä vaiheessa käyttäjä voi antaa haluamansa riskinsietokyvyn, rajoitteet eri varallisuuslajeille ja opitimoida riski/tuotto/vakavaraisuusasemansa.

- käyttäjä voi tallentaa tekemänsä muutokset

- käyttäjä voi kirjautua ulos järjestelmästä

## Jatkokehitysideoita

Perusversion jälkeen järjestelmää täydennetään ajan salliessa esim. seuraavilla toiminnallisuuksilla

- Varallisuuslajien lisääminen
- Monimutkaisempi odotettujen nettotulojen laskeminen
- Enemmän vaihtoehtoja käyttäjälle pääoman optimointiin
- Graafista esitystä riskin ja tuoton suhteesta
- Salasana kirjautuessa
