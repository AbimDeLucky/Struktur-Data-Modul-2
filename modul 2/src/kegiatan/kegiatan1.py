from typing import List


def main() -> None:
    hewan: List[str] = []

    hewan.insert(0, "Angsa")
    hewan.insert(1, "Bebek")
    hewan.insert(2, "Cicak")
    hewan.insert(3, "Domba")
    hewan.insert(4, "Elang")
    hewan.insert(5, "Gajah")
    hewan.insert(6, "Badak")
    hewan.insert(7, "Bebek")

    print("\nOutput 1,2 :")
    print(hewan)
    print("Bebek = " + str(hewan.index("Bebek")) + "," +
          str(len(hewan) - hewan[::-1].index("Bebek") - 1))

    hewan.pop(1)
    print("\nOutput 3 :\n" + str(hewan))

    print("\nOutput 4 :")
    print("Index ke-0 : " + hewan[0])
    print("Index ke-2 : " + hewan[2])
    hewan.pop(0)
    print(hewan)

    print("\nOutput 5 :")
    hewan[0] = "Ular"
    print(hewan)
    hewan.insert(2, "Itik")
    print(hewan)

    print("\nOutput 6 :")
    hewan[2:5] = []
    print(hewan)

    print("\nOutput 7 :")
    print("Elemen pertama : " + hewan[0])
    print("Elemen Terakhir : " + hewan[-1])

    print("\nOutput 8,9 :")
    print("Jumlah index : " + str(len(hewan)))
    print("Posisi index Badak : " + str(hewan.index("Badak")))


if __name__ == "__main__":
    main()
