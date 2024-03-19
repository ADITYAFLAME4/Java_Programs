class GDrive {
	void upload(int image) {
		System.out.println("This is a image:  " + image);
	}

	void upload(String video, int image) {
		System.out.println("This is both String and image:  " + video + "  " + image);
	}

	void upload(String video) {
		System.out.println("This is a video:  " + video);
	}

	public static void main(String[] args) {
		GDrive gDrive = new GDrive();
		gDrive.upload(123);
		gDrive.upload("Hello", 23);
		gDrive.upload("Hi");
	}
}