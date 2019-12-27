package fabrykaMetodaFabrykujaca;

/*
 *  Jak widać klasa fabryki jest teraz klasą abstrakcyjną. 
 *  Logika w switchu została zastąpiona mechanizmem polimorfizmu.
 *   Teraz jeśli będziemy chcieli dodać jakąś inną część sklepu do budowy, wystarczy dodać klasę fabryki, 
 *   nie musimy zmieniać klasy fabryki, czyli jest spełniona zasada open- closed.
 *   Dzięki korzystaniu z klasy abstrakcyjnej jaką jest metoda fabrykująca, możemy posiadać klasy, 
 *   które będą po niej dziedziczyć i wykorzystywać jej metody, czyli mamy większę możliwości niż w prostej fabryce, 
 *   która ma jedynie jeden prosty switch.
 *   Jest wiele zalet metody fabrykującej oto najważniejsze z nich:
 *   -spełnia zasadę open-closed, jest łatwiejsza do późniejszych modyfikacji
 *   -główny kod fabryki może być niewidoczny dla programisty np w jakieś bibliotece a i tak będzie mógł ją
 *    rozbudowywać dzięki zachowanej zasadzie open-closed
 *    -warstwa abstrakcji, która hermetyzuje skomplikowaną logikę tworzenia instancji obiektu.
 *    -fabryki pochodne są łatwe do testowania, wystarczy wprowadzić interfejs, który będą spełniać.
 */

public interface IPartShop {
}

class Roof implements IPartShop {
}

class Floor implements IPartShop {
}

class Wall implements IPartShop {
}