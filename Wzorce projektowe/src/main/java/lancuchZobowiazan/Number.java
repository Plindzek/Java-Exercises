package lancuchZobowiazan;

public abstract class Number {
        protected Number number;

        public void setObject(Number number)
        {
            this.number = number;
        }

        public abstract void forwardRequest(TypeNumber typenumber);
    }
