# Vaatimusm‰‰rittely

## Soveluksen tarkoitus

Sovelluksen avulla k‰ytt‰j‰ voi m‰‰ritell‰ itselleen _vakavaraisuustarpeen_. T‰m‰ tarkoittaa sit‰, ett‰ k‰ytt‰j‰ muodostaa itselleen taseen, joka koostuu varallisuudesta (asunto, osakkeet...) ja veloista (lainat etc.). Lis‰ksi velkapuolella n‰kyy k‰ytt‰j‰n odotettujen tulevien nettotuottojen nykyarvo. T‰ten k‰ytt‰j‰n markkinaehtoinen nettovarallisuus on: Nettovarallisuus = Varat - Lainat - odotettu nettotulot.

T‰m‰n lis‰ksi k‰ytt‰j‰lle lasketaan p‰‰omatarve, joka muodostuu varallisuuden ja odotettujen nettotulojen menett‰misest‰ 1/200 todenn‰kˆisyydell‰.

Kun vakavaraisuus asema on m‰‰ritelty, voi k‰ytt‰j‰ opimoida varallisuuden sijoittamista joko riskillisemmin tai v‰hemm‰n riskillisesti, riippuen k‰ytt‰j‰n mieltymyksist‰.

## K‰ytt‰j‰t

Sovelluksella on yksi k‰ytt‰j‰. Mutta parametrit on asetettu etuk‰teen _p‰‰k‰ytt‰j‰n_ roolissa.
Sovellukseen voi myˆhemmin luoda useita k‰ytt‰ji‰.

## K‰yttˆliittym‰luonnos

Sovellus koostuu kolmesta eri n‰kym‰st‰

<img src="https://raw.githubusercontent.com/mluukkai/OtmTodoApp/master/dokumentaatio/kuvat/v-1.png" width="750">

Sovellus aukeaa kirjautumisn‰kym‰‰n, josta on mahdollista siirty‰ uuden k‰ytt‰j‰n luomisn‰kym‰‰n tai onnistuneen kirjautumisen yhteydess‰ kirjaantuneen k‰ytt‰j‰n teht‰v‰listaan.

## Perusversion tarjoama toiminnallisuus

### Ennen kirjautumista

- k‰ytt‰j‰ voi luoda j‰rjestelm‰‰n k‰ytt‰j‰tunnuksen
  - k‰ytt‰j‰tunnuksen t‰ytyy olla uniikki ja pituudeltaan v‰hint‰‰n 4 merkki‰

- k‰ytt‰j‰ voi kirjautua j‰rjestelm‰‰n
  - kirjautuminen onnistuu syˆtett‰ess‰ olemassaoleva k‰ytt‰j‰tunnus kirjautumislomakkeelle
  - jos k‰ytt‰j‰‰ ei olemassa, ilmoittaa j‰rjestelm‰ t‰st‰

### Kirjautumisen j‰lkeen

- Varallisuus ja lainat: K‰ytt‰j‰ voi valita taseeseensa varallisuuslajeja esim. asunto ja asettaa niiden markkina-arvon.

- Jos varallisuus on jo aikaisemmin asetettu k‰ytt‰j‰n tase ladataan kirjautuessa ja k‰ytt‰j‰ voi tehd‰ p‰ivityksi‰.

- Odotettujen nettotuottojen laskemista varten k‰ytt‰j‰ syˆtt‰‰: odotetun nettopalkan, odotetut vuosimenot, tuotot sijoituksista, i‰n, sukupuolen, asuinpaikan ja koulutuksen.

- K‰ytt‰j‰ voi laskea vakavaraisuusasemansa

- Ja myˆhemm‰ss‰ vaiheessa k‰ytt‰j‰ voi antaa haluamansa riskinsietokyvyn, rajoitteet eri varallisuuslajeille ja opitimoida riski/tuotto/vakavaraisuusasemansa.

- k‰ytt‰j‰ voi tallentaa tekem‰ns‰ muutokset

- k‰ytt‰j‰ voi kirjautua ulos j‰rjestelm‰st‰

## Jatkokehitysideoita

Perusversion j‰lkeen j‰rjestelm‰‰ t‰ydennet‰‰n ajan salliessa esim. seuraavilla toiminnallisuuksilla

- Varallisuuslajien lis‰‰minen
- Monimutkaisempi odotettujen nettotulojen laskeminen
- Enemm‰n vaihtoehtoja k‰ytt‰j‰lle p‰‰oman optimointiin
- Graafista esityst‰ riskin ja tuoton suhteesta
- Salasana kirjautuessa