package com.company.homework.homework8;

public class Robot implements Member, Jumpable, Runables{
        private String name;
        private String meansOfTransportation;
        private int maxJump;
        private int maxRun;

        public Robot(String name, String meansOfTransportation, int maxJump, int maxRun) {
            this.name = name;
            this.meansOfTransportation = meansOfTransportation;
            this.maxJump = maxJump;
            this.maxRun = maxRun;
        }

        @Override
        public void jump() {
            System.out.println(name + ": Взметаю ввысь. У меня " + meansOfTransportation + ".");
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void run() {
            System.out.println(name + ": Бегу за маслом. У меня " + meansOfTransportation + ".");
        }

        @Override
        public int getMaxJump() {
            return maxJump;
        }

        @Override
        public int getMaxRun() {
            return maxRun;
        }

        @Override
        public String getMeansOfTransportation() {
            return meansOfTransportation;
        }
}
