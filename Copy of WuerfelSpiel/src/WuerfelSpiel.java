class WuerfelSpiel {

	public static void main(String[] args) {

		int x = 0, y = 0, high = 0;
		int[] ar = new int[5];
		Wuerfel[] wuerfel = new Wuerfel[5];

		for (int i = 0; i < wuerfel.length; i++) {
			wuerfel[i] = new Wuerfel();
			//ar[i] = 0;
		}
		
		/**
		 * test
		 *  
		 */
		
		// 4er Push ermitteln und ausgeben
		for (int z = 0; z < 5; z++) {
			for (int i = 0; i < 5; i++) {
				
				// Wenn Wert größer 10 nicht würfeln
				if (wuerfel[i].getWert() < 10) {
					wuerfel[i].wuerfeln();
				} else {
					continue;
				}
				
				// Wenn Wert kleiner als x ist wird x neu gesetzt
				if (x <= wuerfel[i].getWert()) {
					x = wuerfel[i].getWert();
					high = x;
					y = i;
				}
				
				// Jeden mit jedem vergleichen
//				if (i == wuerfel.length -1) {
//					for (int j = 0; j < wuerfel.length; j++) {
//						
//						System.out.println(wuerfel[j].getWert());
//					}
//				}
				
				
//				if (i == 4) {
//					for (int j = 0; j < wuerfel.length; j++) {
//						if (high == wuerfel[j].getWert()) {
//							ar[j] = wuerfel[j].getWert();
//						}
//					}
//				}
				
				//System.out.println(wuerfel[i].getWert());
				
				
			}
			wuerfel[y].setWert(10 + wuerfel[y].getWert());
			System.out.println("Würfel " + y + " --> " + (wuerfel[y].getWert() -10) + " Augen " + wuerfel[y].getWurf() + ". Wurf");
			
			
			for (int j = 0; j < wuerfel.length; j++) {
				
				System.out.println(wuerfel[j].getWert());
			}
			
			System.out.println();
			x = 0;
			
//			for (int i = 0; i < ar.length; i++) {
//				System.out.println( i + ". -> " + ar[i]);
//			}
			
			
		}
		
		System.out.println(" -------------------------------------------------------- ");
		
		
		
		
		// Höchsten Wurf rausnehmen und am ende alle zusammenzählen
//		for (int z = 0; z < 5; z++) {
//			for (int i = 0; i < 5; i++) {
//
//				if (wuerfel[i].getWert() < 10) {
//					wuerfel[i].wuerfeln();
//				} else {
//					continue;
//				}
//
//				if (x <= wuerfel[i].getWert()) {
//					x = wuerfel[i].getWert();
//					y = i;
//				}
//				
//			}
//			wuerfel[y].setWert(10 + wuerfel[y].getWert());
//			System.out.println("Würfel " + y + " --> " + (wuerfel[y].getWert() -10) + " Augen " + wuerfel[y].getWurf() + ". Wurf");
//			System.out.println();
//			x = 0;
			high = 0;
//		}
		
	}
}
