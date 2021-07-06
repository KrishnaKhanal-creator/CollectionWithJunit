package com.kk.question.three;

public class Client {
        public static void main(String[] args) {
        MimicService mimicService = new MimicService();
        System.out.println("Current list:");
        mimicService.showAll();
        System.out.println("\nAdding 39 to set");
        mimicService.add(39);
        mimicService.showAll();
        System.out.println("\nRemoving a last item from set");
        mimicService.remove(-1);
        mimicService.showAll();
    }
}
