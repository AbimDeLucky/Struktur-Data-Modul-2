# Membuat objek List Hewan
hewan = ["Sapi", "Kelinci", "Kambing", "Unta", "Domba"]

# Membuat objek List DeleteHewan
deleteHewan = ["Kelinci", "Kambing", "Unta"]

# print hewan dan deletehewan
print('hewan', hewan)
print('Hewan yang dihapus', deleteHewan)

# Menghapus data yang sama pada objek Hewan dengan data pada objek DeleteHewan
for data in deleteHewan:
    while data in hewan:
        hewan.remove(data)

# Menampilkan hasil penghapusan
print("Hasil penghapusan:")
for data in hewan:
    print(data)
