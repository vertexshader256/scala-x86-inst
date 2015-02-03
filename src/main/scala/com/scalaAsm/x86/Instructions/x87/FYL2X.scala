package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compute y × log2x and Pop
// Category: general/trans

object FYL2X extends InstructionDefinition("FYL2X") with FYL2XImpl

trait FYL2XImpl {
  implicit object FYL2X_0 extends FYL2X._0 {
    val opcode: OneOpcode = 0xD9 /+ 6
    override def hasImplicitOperand = true
  }
}
