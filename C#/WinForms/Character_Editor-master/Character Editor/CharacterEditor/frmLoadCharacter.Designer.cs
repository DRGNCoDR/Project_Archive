namespace CharacterEditor
{
    partial class frmLoadCharacter
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.cmbCharacterList = new System.Windows.Forms.ComboBox();
            this.lblCharacterInfo = new System.Windows.Forms.Label();
            this.btnLoad = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // cmbCharacterList
            // 
            this.cmbCharacterList.FormattingEnabled = true;
            this.cmbCharacterList.Location = new System.Drawing.Point(12, 34);
            this.cmbCharacterList.Name = "cmbCharacterList";
            this.cmbCharacterList.Size = new System.Drawing.Size(260, 21);
            this.cmbCharacterList.TabIndex = 0;
            this.cmbCharacterList.SelectedValueChanged += new System.EventHandler(this.cmbCharacterList_SelectedValueChanged);
            // 
            // lblCharacterInfo
            // 
            this.lblCharacterInfo.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.lblCharacterInfo.Location = new System.Drawing.Point(12, 105);
            this.lblCharacterInfo.Name = "lblCharacterInfo";
            this.lblCharacterInfo.Size = new System.Drawing.Size(260, 252);
            this.lblCharacterInfo.TabIndex = 1;
            // 
            // btnLoad
            // 
            this.btnLoad.Location = new System.Drawing.Point(192, 79);
            this.btnLoad.Name = "btnLoad";
            this.btnLoad.Size = new System.Drawing.Size(80, 23);
            this.btnLoad.TabIndex = 2;
            this.btnLoad.Text = "Open File";
            this.btnLoad.UseVisualStyleBackColor = true;
            this.btnLoad.Click += new System.EventHandler(this.btnLoad_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(58, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "Characters";
            // 
            // frmLoadCharacter
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 366);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnLoad);
            this.Controls.Add(this.lblCharacterInfo);
            this.Controls.Add(this.cmbCharacterList);
            this.Name = "frmLoadCharacter";
            this.Text = "frmLoadCharacter";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox cmbCharacterList;
        private System.Windows.Forms.Label lblCharacterInfo;
        private System.Windows.Forms.Button btnLoad;
        private System.Windows.Forms.Label label1;
    }
}