# Collections
This repo for all collection class example




ADMIN@DESKTOP-GJQI48R MINGW64 ~/Documents/New folder-collection
$ git clone https://github.com/Laxman-1227/Collections.git
Cloning into 'Collections'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (3/3), done.

ADMIN@DESKTOP-GJQI48R MINGW64 ~/Documents/New folder-collection
$ git status
fatal: not a git repository (or any of the parent directories): .git

ADMIN@DESKTOP-GJQI48R MINGW64 ~/Documents/New folder-collection
$ cd Collections/

ADMIN@DESKTOP-GJQI48R MINGW64 ~/Documents/New folder-collection/Collections (main)
$ git checkout feature/Laxman
Switched to a new branch 'feature/Laxman'
branch 'feature/Laxman' set up to track 'origin/feature/Laxman'.

ADMIN@DESKTOP-GJQI48R MINGW64 ~/Documents/New folder-collection/Collections (feature/Laxman)
$ git status
On branch feature/Laxman
Your branch is up to date with 'origin/feature/Laxman'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ListEx.java

nothing added to commit but untracked files present (use "git add" to track)

ADMIN@DESKTOP-GJQI48R MINGW64 ~/Documents/New folder-collection/Collections (feature/Laxman)
$ git add ListEx.java


ADMIN@DESKTOP-GJQI48R MINGW64 ~/Documents/New folder-collection/Collections (feature/Laxman)
$ git commit -m "added file"
[feature/Laxman 576ee31] added file
 1 file changed, 121 insertions(+)
 create mode 100644 ListEx.java

ADMIN@DESKTOP-GJQI48R MINGW64 ~/Documents/New folder-collection/Collections (feature/Laxman)
$ git push
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 991 bytes | 991.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/Laxman-1227/Collections.git
   6a7d8fd..576ee31  feature/Laxman -> feature/Laxman

ADMIN@DESKTOP-GJQI48R MINGW64 ~/Documents/New folder-collection/Collections (feature/Laxman)
$

