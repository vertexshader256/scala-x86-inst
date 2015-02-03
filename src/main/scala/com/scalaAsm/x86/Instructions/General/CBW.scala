package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert Byte to Word
// Category: general/conver

object CBW extends InstructionDefinition("CBW") with CBWImpl

trait CBWImpl {
  implicit object CBW_0 extends CBW._0 {
    val opcode: OneOpcode = 0x98
    override def hasImplicitOperand = true
  }
}
