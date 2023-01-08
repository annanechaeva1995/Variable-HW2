public class Main {
    public static void main(String[] args){
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    dog = dog + 4;
    System.out.println(dog);
    cat = cat + 4;
    System.out.println(cat);
    paper = paper + 4;
    System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println( );

    var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println( );

    var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println( );

     var firstBoxerWeight = 78.2;
     var secondBoxerWeight = 82.7;
     var totalWeight = firstBoxerWeight + secondBoxerWeight;
     System.out.println("Общий вес двух бойцов " + totalWeight + " кг.");
     var weightDifference = secondBoxerWeight - firstBoxerWeight;
     System.out.println("Разница в весе боксеров " + weightDifference + " кг.");
     var overweight = secondBoxerWeight % firstBoxerWeight;
     System.out.println(overweight);
     System.out.println( );

     var workingHours = 640;
     var employeeWorkingHours = 8;
     var employees = workingHours/employeeWorkingHours;
     System.out.println(employees);
     var totalEmployees = employees + 94;
     System.out.println(totalEmployees);
     var newWorkingHours = totalEmployees * employeeWorkingHours;
     System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + newWorkingHours + " часа работы может быть поделено между сотрудниками.");}
}