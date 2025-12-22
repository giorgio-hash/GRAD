# GRAD

- [Manuale Utente](https://docs.google.com/document/d/1-xVcrvf3Gv0_ktjn3BYRLdLm__i7DGcvBZsS717SyS0/edit?usp=drivesdk)

- [Documentazione Tecnica](https://docs.google.com/document/d/1dWWYBH2Nr3rc3W0u43n7Ouomw4CL6Sz9LkW8AwAAy_M/edit?usp=drivesdk)

## Overview
GRAD è un'applicazione Desktop progettata per aiutare gli studenti universitari nella pianificazione del proprio percorso accademico.
I dati vengono inseriti in dei file di configurazione dedicati:
- il file in formato GRAD, contenente gli anni di studio e relativi esami per il piano studi di ciascuno;
- il file in formato YAML, contenente propedeuticità obbligatorie e consigliate per gli esami del file GRAD.

GRAD offre una dashboard sommaria che permette di ottenere una prospettiva sui dati, con opzioni di filtraggio per anno, propedeutica (obbligatoria o consigliata) e moduli (detti <i>milestone</i>).

<p align="center">
<img src="./docs/images/career_dashboard.png" alt="Descrizione immagine">
</p>

GRAD consente di creare rappresentazioni grafiche ispirate agli strumenti GANTT utilizzati nel project management, semplificando la visualizzazione temporale del proprio piano di studi. 

Gli <b>esami</b> sono rappresentati secondo il loro peso in CFU, fornendo una prospettiva sul tempo di studio richiesto per raggiungere l'appello obiettivo. Tale tempistica viene calcolata in funzione delle ore di studio giornaliere che lo studente intende dedicare in media;

In tal modo, lo studente sarà in grado di:
- individuare sovrapposizioni tra esami;
- comprendere lo stato di completamento delle collezioni di esami, aggregando per anno o altri vincoli.

<p align="center">
<img src="./docs/images/ganttchart.png" alt="Descrizione immagine">
</p>

Esempio di visualizzazione aggregata per modulo "PsyBase", dove "psicologia generale" è inoltre parte degli esami propedeutici:
<p align="center">
<img src="./docs/images/ganttchart_PsyBase.png" alt="Descrizione immagine" height="300">
</p>

Esempio di visualizzazione aggregata per anno "Year 1":
<p align="center">
<img src="./docs/images/ganttchart_year.png" alt="Descrizione immagine">
</p>

GRAD consente di aggiornare lo stato degli esami, riportando il proprio progresso sulla barra di completamento dell'aggregazione specifica.
<p align="center">
<img src="./docs/images/ganttchart_update.png" alt="Descrizione immagine">
</p>
