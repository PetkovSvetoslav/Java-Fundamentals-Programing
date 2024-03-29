	public class ChangeList_02 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
	                .map(Integer::parseInt).collect(Collectors.toList());
	 
	        String command = scanner.nextLine(); 
	        while(!command.equals("end")) {
	                String commandName = command.split(" ")[0]; 
	                int element = Integer.parseInt(command.split(" ")[1]);
	                if (commandName.equals("Delete")) {
	                    numbers.removeAll(Arrays.asList(element));
	                } else if (commandName.equals("Insert")) {
	                    int position = Integer.parseInt(command.split(" ")[2]);
	                    numbers.add(position, element);
	                }
	            command = scanner.nextLine();
	        }
	 
	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }
	    }
	}
