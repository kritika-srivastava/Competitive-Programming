class Salescom {
    private double sale, com;

    Salescom(double S) {
        sale = S;
        com = 0;
    }

    void commission() {
        if (sale <= 1000) {
            com = (5 / 100) * sale;
        }
        if ((sale > 1000) && (sale <= 2000)) {
            com = (10 / 100) * sale;
        }
        {
            if (sale > 2000) {
                com = (15 / 100) * sale;
            }
        }
    }

    void display() {
        System.out.println("Sale Value = " + sale);
        System.out.println("Commission on Sale =" + com);
    }
}
