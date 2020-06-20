<img src="https://my-bucket-image2.s3.amazonaws.com/ImageGitHub/logo-git.png" alt="drawing" width="200"/>

___

Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency. :-)

<div style="text-align:center">
    <img src="https://my-bucket-image2.s3.amazonaws.com/ImageGitHub/local-operations.png" alt="drawing" width="450"/>
</div>


# [Setting git 🙂](https://github.com/markdown-it/markdown-it-emoji)

| Command | Description |
| ------- | ----------- |
| <code>git --version</code>    | Git version. |
| <code>git config --global user.email ['email']</code>    | Setting email. |
| <code>git config --global user.name ['name']</code>    | Setting name. |
| <code>git config -l</code>    | Show detail of git settings. |
| <code>git config --global color.ui true</code>    | Setting color on git. |

# [Git Commands 🙃](https://github.com/markdown-it/markdown-it-emoji)

| Command | Description |
| ------- | ----------- |
| <code>git init</code>    | Init to repository. |
| <code>git status</code>    | shows the state of the working directory and the staging area. |
| <code>git add</code>    | Add files to the staging areay 'Tracked'. |
| <code>git add .</code>    | Add all files to the staging areay. |
| <code>git commit -m ['message']</code>    | Commit files to the local repository. |
| <code>git commit -am ['message']</code>    | Add and commit files to the local repository. |
| <code>git show</code>    | Shows one or more objects (blobs, trees, tags and commits). |
| <code>git log</code>    | Lists the commits made in that repository. |
| <code>git log ['file']</code>    | Show commits made in that file specified. |
| <code>git log --stat</code>    | Show commits made in that file specified. |
| <code>git rm ['folder/file']</code>    | Removes a file from both the repository and the working directory. |
| <code>git rm --cache ['folder/file']</code>    | Remove files from staging area. |
| <code>git clone ['URL']</code>    | Used to target an existing repository and create a clone. |
| <code>git diff ['sha']</code>    | Show changes between commits and staging. |
| <code>git diff ['sha'] ['sha']</code>    | Show changes between commits. |
| <code>git checkout ['branch-name']</code>    | Switch branches. |
| <code>git checkout ['sha']</code>    | Switch restore working tree files. |
| <code>git checkout -b ['branch-name']</code>    | Reate and switch branches. |
| <code>git tag ['tag-name']</code>    | Tags are ref's that point to specific points in Git history. |
| <code>git tag -a v1.4 -m ['version1.4']</code>    | Command will create a new annotated tag identified with v1.4. |

# [Git-branch - List, create, or delete branches 🙂](https://github.com/markdown-it/markdown-it-emoji)

| Command | Description |
| ------- | ----------- |
| <code>git branch ['branch-name']</code>    | Create branch. |
| <code>git branch -l</code>    | List branches. |
| <code>git branch -d ['branch-name'] </code>    | Delete branch. |
| <code>git branch -D ['branch-name']</code>    | Forza delete branch. |
| <code>git checkout ['branch-name']</code>    | Git-checkout - Switch branches or restore working tree files. |
| <code>git checkout ['SHA']</code>    | Git-checkout - Switch commit. |
| <code>git checkout -b ['branch-name']</code>    | Create and switch branches. |


# [Git Tags 🙂](https://github.com/markdown-it/markdown-it-emoji)

| Command | Description |
| ------- | ----------- |
| <code>git tag ['tag-name']</code>    | Create tag. |
| <code>git tag -l</code>    | List tages. |
| <code>git tag -d ['tag-name'] </code>    | Delete tag. |
| <code>git tag -D ['tag-name']</code>    | Forza delete tag. |
| <code>git checkout ['tag-name']</code>    | Git-checkout - Switch tages or restore working tree files. |
| <code>git checkout ['SHA']</code>    | Git-checkout - Switch commit. |
| <code>git checkout -b ['tag-name']</code>    | Create and switch tages. |

💻

```console
$ git tag v0.1.0 // create tag

$ git tag -a v0.1.1 // creat tag with comment

$ git tag // list of tags
v0.1.0

$ git tag -l // list of tags
v0.1.0

$ git tag -l "0.1.*" // filter tags
v0.1.0

$ git tag -d v0.1.0 // delete tag
Delete tag 'v0.1.0' (was 1234234u)

$ git show v0.1.0 // show tags
```
