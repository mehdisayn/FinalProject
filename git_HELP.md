### 📘 GIT\_CHEATSHEET.md

> 🛠️ *For CSE213 Group 73 Team — Summer 2025 Project*
> Git Commands & Workflow Guide (for absolute beginners)

---

## 🧱 1. Setup

```bash
# Install Git if not installed (Google: git download)
# Set your identity once
git config --global user.name "Your Name"
git config --global user.email "your@email.com"
```

---

## 📦 2. Clone the Repository (First Time Only)

```bash
git clone https://github.com/YourUsername/PaperMillSimulation.git
cd PaperMillSimulation
```

---

## 🌿 3. Checkout Your Assigned Branch

```bash
# Example if your role is HR Manager:
git checkout -b hr-manager origin/hr-manager

# Other examples:
git checkout -b ceo origin/ceo
git checkout -b factory-manager origin/factory-manager
```

> ✅ This will switch you to your own working branch.

---

## 💾 4. Add & Commit Changes

```bash
git status                  # Check what files changed
git add .                   # Add all changed files
git commit -m "Add dashboard UI"  # Save with a message
```

---

## 🚀 5. Push Your Work to GitHub

```bash
git push                    # Push your commits to your branch
```

---

## 🔄 6. Get Latest Code from GitHub

```bash
git pull origin main        # Pull latest `main` updates to stay synced
```

Then re-merge into your branch if needed:

```bash
git merge main              # Merge latest main into your branch
```

---

## 📬 7. Create a Pull Request (PR)

> ❗ You CANNOT push directly to `main` (it's protected).
> You MUST request your branch to be merged.

1. Go to GitHub → Your Repo
2. Click **"Pull Requests"**
3. Click **"New Pull Request"**
4. Base: `main` ← Compare: your branch
5. Write a short message, then click **"Create Pull Request"**

---

## 🧠 Quick Reference

| Task                   | Command                                    |
| ---------------------- | ------------------------------------------ |
| Clone repo             | `git clone <repo>`                         |
| Create new branch      | `git checkout -b mybranch origin/mybranch` |
| See branches           | `git branch` / `git branch -r`             |
| Stage changes          | `git add .`                                |
| Commit changes         | `git commit -m "message"`                  |
| Push code              | `git push`                                 |
| Pull latest code       | `git pull origin main`                     |
| Merge main into branch | `git merge main`                           |
| Create Pull Request    | On GitHub → Pull Requests → New PR         |

---

## ☕ Tips

* Always `git pull origin main` before starting new work.
* Never push directly to `main`.
* Keep your commit messages short but meaningful.
* Don’t be afraid to ask if something breaks (happens to all of us 😅)
