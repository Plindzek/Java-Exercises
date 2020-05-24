package czynnosciowe.lancuchZobowiazan;

public abstract class Number {

    protected Number number;

    /**
     * tworzy listę jednokierunkową, czyli przypisuje obiekt z argumentu do
     * referencji czynnosciowe.lancuchZobowiazan.Number number w klasie czynnosciowe.lancuchZobowiazan.Number
     */

        public void setObject(Number number)
        {
            this.number = number;
        }

    /**
     * przekazuje zadanie o określonym numerze
     * 
     * @param typenumber numer zadania
     */
        public abstract void forwardRequest(TypeNumber typenumber);
    }
